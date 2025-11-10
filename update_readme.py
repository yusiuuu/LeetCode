import os
from datetime import datetime

README_PATH = "README.md"
ROOT_DIR = "."

def get_problem_folders():
    # Ignore hidden/system folders
    exclude = {".git", ".github", "__pycache__"}
    return [f for f in os.listdir(ROOT_DIR)
            if os.path.isdir(f) and f not in exclude]

def get_latest_problem(problem_folders):
    # Find the most recently modified folder
    if not problem_folders:
        return None
    latest = max(problem_folders, key=lambda f: os.path.getmtime(f))
    return latest

def update_readme():
    problem_folders = get_problem_folders()
    total = len(problem_folders)
    last_updated = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    latest = get_latest_problem(problem_folders)

    # Sort folders numerically by problem number
    def sort_key(f):
        num = f.split("-")[0]
        return int(num) if num.isdigit() else float('inf')
    problem_folders.sort(key=sort_key)

    # Build table
    table = "| # | Problem | Link |\n|---|----------|------|\n"
    for folder in problem_folders:
        parts = folder.split("-", 1)
        num = parts[0]
        name = parts[1].replace("-", " ").title() if len(parts) > 1 else folder
        table += f"| {num} | {name} | [View]({folder}) |\n"

    new_content = f"""# 🧠 LeetCode Progress Tracker

- ✅ Total Problems Solved: {total}
- 🕒 Last Updated: {last_updated}
- 📂 Latest Problem: {latest}

{table}
"""

    with open(README_PATH, "w", encoding="utf-8") as f:
        f.write(new_content)

    print(f"Updated README with {total} problems (latest: {latest})")

if __name__ == "__main__":
    update_readme()
