# 🎅 Secret Santa Assignment 🎁

## 📌 Project Overview

This Java program automates the **Secret Santa** assignment process by randomly pairing employees while ensuring:

- No one is assigned to themselves.
- No one is assigned to the same person as last year.
- Each person is assigned exactly one Secret Santa.

The program reads employee details from a CSV file and considers past assignments to avoid duplicate pairings. The final assignments are saved in an output CSV file.

---

## ✅ Features

- Reads employee data from a CSV file.
- Checks last year's assignments to prevent repeated matches.
- Randomly assigns each employee a Secret Santa.
- Saves the results to an output file (`data/output.csv`).
- Re-runs the process if valid assignments are not found.

---

## 🛠 Installation Guide

### **1️⃣ Prerequisites**

Ensure you have the following installed:

- **Java 11+** (JDK)
- **Eclipse IDE** (or any Java IDE)
- **Git** (optional)

---

## 🚀 Running the Program

### **1️⃣ Clone or Download the Repository**

```sh
git clone https://github.com/<your-repo>/secret-santa.git
cd secret-santa
```

Or manually download and extract the ZIP file.

### **2️⃣ Import the Project into Eclipse**

1. Open **Eclipse**.
2. Go to **File** → **New** → **Java Project**.
3. Name it `` and click **Finish**.
4. Copy the `src/` and `data/` folders into the project.
5. **Refresh the project** in Eclipse.

### **3️⃣ Run the Program**

1. Locate `Main.java` inside `src/com/secretsanta/`.
2. Right-click on `Main.java` → **Run As** → **Java Application**.
3. The console should display:
   ```
   Secret Santa assignments completed successfully!
   ```

### **4️⃣ Check the Output**

The generated assignments will be saved in:

```
data/output.csv
```

Open the file to view the Secret Santa pairs.

---

## 📚 Project Structure

```
secret-santa/
│️── src/
│️   ├── com/
│️   │️   ├── secretsanta/
│️   │️   │️   ├── Main.java
│️   │️   │️   ├── model/
│️   │️   │️   │️   ├── Employee.java
│️   │️   │️   ├── service/
│️   │️   │️   │️   ├── CsvParser.java
│️   │️   │️   │️   └── SecretSantaService.java
│️── data/
│️   ├── employees.csv
│️   ├── previous_year.csv
|   ├── output.csv
│️── README.md
```

---

## 📊 Expected CSV Input and Output

### **💞 Input: **``

| Employee\_Name | Employee\_EmailID                                        |
| -------------- | -------------------------------------------------------- |
| Hamish Murray  | [hamish.murray@acme.com](mailto\:hamish.murray@acme.com) |
| Layla Graham   | [layla.graham@acme.com](mailto\:layla.graham@acme.com)   |
| Matthew King   | [matthew.king@acme.com](mailto\:matthew.king@acme.com)   |

### **💞 Input: **``

| Employee\_Name | Secret\_Child\_Name |
| -------------- | ------------------- |
| Hamish Murray  | Layla Graham        |
| Layla Graham   | Matthew King        |
| Matthew King   | Hamish Murray       |

---

### **📤 Output: **``

| Employee\_Name | Employee\_EmailID                                        | Secret\_Child\_Name | Secret\_Child\_EmailID                                   |
| -------------- | -------------------------------------------------------- | ------------------- | -------------------------------------------------------- |
| Hamish Murray  | [hamish.murray@acme.com](mailto\:hamish.murray@acme.com) | Matthew King        | [matthew.king@acme.com](mailto\:matthew.king@acme.com)   |
| Layla Graham   | [layla.graham@acme.com](mailto\:layla.graham@acme.com)   | Hamish Murray       | [hamish.murray@acme.com](mailto\:hamish.murray@acme.com) |
| Matthew King   | [matthew.king@acme.com](mailto\:matthew.king@acme.com)   | Layla Graham        | [layla.graham@acme.com](mailto\:layla.graham@acme.com)   |

---

## 🛠 Troubleshooting

### **❌ "Project was not built since its build path is incomplete."**

- Right-click the project → **Build Path** → **Configure Build Path**.
- Go to **Libraries** → **Add Library** → Select **JRE System Library**.

### **❌ "Cannot find class file for java.lang.Object"**

- Ensure the correct **JDK version** is installed.
- In Eclipse, go to **Project** → **Properties** → **Java Build Path** → Select the correct **JRE**.

### **❌ "Error: FileNotFoundException (employees.csv)"**

- Make sure `employees.csv` and `previous_year.csv` exist inside the `data/` folder.
- Paths should be relative (`data/employees.csv`).

---

## 📝 License

This project is **open-source** and free to use.

---

🎄 Happy Coding & Merry Secret Santa! 🎁

```
```
