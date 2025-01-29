# 🏦 Skypay - Bank Kata

**Skypay - Bank Kata** est un projet conçu pour simuler un système bancaire simple permettant **les dépôts, retraits et l'affichage du relevé bancaire**.  
Ce projet suit l'approche **Test-Driven Development (TDD)** et combine les approches **Mockist et Classicist** pour assurer une couverture de tests optimale.

## 📌 Fonctionnalités Implémentées
- 🏦 **Créer un compte bancaire**
- 💰 **Effectuer des dépôts et retraits**
- 📄 **Générer un relevé bancaire formaté**
- 🔄 **Stocker un historique des transactions**
- ✅ **Gestion des erreurs** (montant négatif, solde insuffisant)
- 🛠 **Approche TDD avec des tests unitaires et Mockist**

---

## 🛠 Technologies Utilisées
- **Java 17+**
- **JUnit** *(Tests unitaires & Mockist)*
- **Mockito** *(Mocking des dépendances)*
- **Maven** *(Gestion du projet et exécution des tests)*
- **Lombok** *(Simplification du code avec annotations)*

---

## 🚀 Installation et Exécution

### **1️⃣ Cloner le Projet**
```sh
git clone https://github.com/sokainadaabal/skypay-bank-kata.git
cd skypay-bank-kata
```

### **2️⃣ Compiler et Exécuter**
```sh
mvn clean install
mvn exec:java
```

---

## 🧪 Exécution des Tests
Le projet inclut des tests **unitaires et Mockist** pour valider toutes les fonctionnalités.

### **1️⃣ Exécuter tous les tests avec Maven**
```sh
mvn test
```

### **2️⃣ Exécuter un test spécifique**
Exemple : Exécuter uniquement `AccountServiceImplTest`
```sh
mvn -Dtest=AccountServiceImplTest test
```

---

## 🔍 Explication de l'Architecture

### **📂 Structure du Projet**
```
📦 skypay-bank-kata
 ┣ 📂 src
 ┃ ┣ 📂 main
 ┃ ┃ ┣ 📂 java
 ┃ ┃ ┃ ┣ 📂 org.skypay.entites
 ┃ ┃ ┃ ┃ ┣ 📜 Account.java
 ┃ ┃ ┃ ┃ ┣ 📜 StatementPrinter.java
 ┃ ┃ ┃ ┃ ┣ 📜 Transaction.java
 ┃ ┃ ┃ ┣ 📂 org.skypay.services
 ┃ ┃ ┃ ┃ ┣ 📜 AccountService.java
 ┃ ┃ ┃ ┃ ┣ 📜 AccountServiceImpl.java
 ┃ ┣ 📂 test
 ┃ ┃ ┣ 📂 java
 ┃ ┃ ┃ ┣ 📂 org.skypay.entites
 ┃ ┃ ┃ ┃ ┣ 📜 StatementPrinterTest.java
 ┃ ┃ ┃ ┣ 📂 org.skypay.services
 ┃ ┃ ┃ ┃ ┣ 📜 AccountAcceptanceMockistTest.java
 ┃ ┃ ┃ ┃ ┣ 📜 AccountServiceImplTest.java
```

### **📌 Explication des Classes**
| 📂 **Package** | 📜 **Classe** | 🎯 **Rôle** |
|--------------|-------------|------------|
| `entites` | `Account` | Gère le solde et l’historique des transactions |
| `entites` | `Transaction` | Représente une opération bancaire |
| `entites` | `StatementPrinter` | Génère le relevé bancaire |
| `services` | `AccountService` | Interface des opérations du compte |
| `services` | `AccountServiceImpl` | Implémente la gestion du compte bancaire |
| `test` | `StatementPrinterTest` | Teste le formatage du relevé bancaire |
| `test` | `AccountServiceImplTest` | Teste la logique métier des transactions |
| `test` | `AccountAcceptanceMockistTest` | Vérifie l’appel correct à `print()` avec Mockito |

---

## 🏆 Approche TDD Utilisée
Ce projet a été développé en **Test-Driven Development (TDD)** en suivant ces étapes :

1️⃣ **Écriture des tests avant le code**  
2️⃣ **Implémentation du code pour passer les tests**  
3️⃣ **Refactoring du code**

### **🎯 Classicist vs Mockist**
- ✅ **Classicist (State-Based Testing)** → Vérifie **le solde après chaque transaction**
- ✅ **Mockist (Behavior-Based Testing)** → Vérifie que `printStatement()` **appelle bien `print()`**

---

## 🎯 Auteurs & Contributeurs
👤 **Sokaina Daabal**  
📧 **sokainadaabal@gmail.com**  
🌍 **https://www.linkedin.com/in/sokainadaabal/**

---

### 🚀 **Prêt à Tester ?**
```sh
mvn test
```
🔥 **Merci d'avoir exploré ce projet !** 😊
