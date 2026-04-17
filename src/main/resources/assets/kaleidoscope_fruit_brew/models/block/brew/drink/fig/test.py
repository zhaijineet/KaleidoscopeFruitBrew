import json
import copy

# 偏移量配置 (count -> list of [dx, dy, dz])
OFFSETS = {
    2: [[4, 0, 0], [-4, 0, 0]],
    3: [[4, 0, 4], [-4, 0, 4], [0, 0, -4]],
    4: [[4, 0, 4], [-4, 0, 4], [4, 0, -4], [-4, 0, -4]],
}

def apply_offset(element, offset):
    """深拷贝 element，并将 from/to 坐标加上 offset，同时处理 rotation.origin"""
    new_elem = copy.deepcopy(element)
    # 偏移 from 和 to
    new_elem["from"] = [new_elem["from"][i] + offset[i] for i in range(3)]
    new_elem["to"] = [new_elem["to"][i] + offset[i] for i in range(3)]
    # 如果存在 rotation.origin，同样偏移
    if "rotation" in new_elem and "origin" in new_elem["rotation"]:
        new_elem["rotation"]["origin"] = [
            new_elem["rotation"]["origin"][i] + offset[i] for i in range(3)
        ]
    return new_elem

def main():
    # 读取原始模型
    with open("count1.json", "r", encoding="utf-8") as f:
        model = json.load(f)

    original_elements = model.get("elements", [])
    if not original_elements:
        print("警告：count1.json 中没有 elements 字段或为空。")
        return

    for count, offsets in OFFSETS.items():
        new_elements = []
        for element in original_elements:
            for offset in offsets:
                new_elements.append(apply_offset(element, offset))
        # 生成新模型
        new_model = copy.deepcopy(model)
        new_model["elements"] = new_elements
        output_file = f"count{count}.json"
        with open(output_file, "w", encoding="utf-8") as f:
            json.dump(new_model, f, indent=2, ensure_ascii=False)
        print(f"已生成 {output_file}，包含 {len(new_elements)} 个 elements。")

if __name__ == "__main__":
    main()
