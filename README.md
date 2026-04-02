# ada-bloc2-TDDWithCI

# 🧪 Correction — Exercices TDD & CI

> Repo de correction destiné aux apprenants ayant réalisé les exercices de **Test-Driven Development** (TDD) avec mise en place d'une **intégration continue (CI)**.

---

## 📚 Contexte pédagogique

Ce dépôt constitue la **correction de référence** après deux exercices pratiques de TDD :

1. **FizzBuzz** — un classique pour s'initier au cycle Rouge → Vert → Refactor
2. **Convertisseur de chiffres romains** — un exercice plus riche pour consolider la démarche

Le code présenté ici est le **résultat final refactoré**, obtenu après avoir suivi rigoureusement la discipline TDD.

---

## 🗂️ Structure du projet

```
.
├── src/
│   ├── main/
│   │   ├── FizzBuzz.java          # Implémentation FizzBuzz
│   │   └── RomanConvert.java      # Implémentation du convertisseur romain
│   └── test/
│       ├── FizzBuzzTest.java      # Tests unitaires FizzBuzz
│       └── RomanConvertTest.java  # Tests unitaires du convertisseur romain
└── .github/
    └── workflows/
        └── ci.yml                 # Pipeline d'intégration continue
```

---

## ✅ Exercice 1 — FizzBuzz

La règle :
- Multiple de **3** → `"Fizz"`
- Multiple de **5** → `"Buzz"`
- Multiple de **3 et 5** → `"FizzBuzz"`
- Sinon → le nombre en chaîne

---

## ✅ Exercice 2 — Convertisseur de chiffres romains

Conversion d'un entier en chiffre romain (jusqu'à **3999**).

L'implémentation dans `src/main/RomanConvert.java` couvre l'ensemble des cas, y compris les formes soustractives (`IV`, `IX`, `XL`, `XC`, `CD`, `CM`…).

---

## ⚙️ Intégration Continue (CI)

Une pipeline CI est configurée via **GitHub Actions**. Elle se déclenche à chaque push et pull request, et vérifie que **tous les tests passent**.

### Ce que vérifie la CI :
- Compilation du projet
- Exécution de l'ensemble des tests unitaires (`FizzBuzzTest` et `RomanConvertTest`)
- Rapport de succès ou d'échec visible directement sur la PR

---

## 🌿 Branches & Pull Requests — Étude de cas

Deux branches illustrent des scénarios pédagogiques importants :

### 🔴 `updateFizzBuzz` — CI en échec

Cette branche ajoute une nouvelle règle : si le nombre est multiple de **2**, retourner `"Bouh"`.

**Problème :** le test existant `assertEquals("fizz", fb.fizzBuzz(6))` est désormais en échec, car 6 est aussi multiple de 2.

```
❌ FizzBuzzTest > testFizzBuzz() FAILED
   expected: <fizz> but was: <bouh>
```

👉 La CI échoue sur cette PR — c'est volontaire. Cela illustre comment la CI **protège la codebase** en signalant une régression avant tout merge.

---

### 🟢 `updateToRoman` — CI au vert

Cette branche je rajoute un test unitaire. 

Tous les tests sont mis à jour et passent. La CI valide la PR avec succès.

```
✅ RomanConvertTest — tous les tests passent
✅ CI — build réussi
```

👉 Cette branche illustre le workflow nominal : code + tests + CI verts = PR mergeable.

---

## 💡 Ce que ce repo illustre

| Concept | Où l'observer |
|---|---|
| CI qui bloque une régression | Branch `updateFizzBuzz` |
| CI qui valide une évolution | Branch `updateToRoman` |
| Code refactoré et lisible | Résultat final sur `main` |


> **Note aux apprenants :** Comparez votre implémentation avec ce repo *après* avoir terminé vos exercices. L'objectif n'est pas d'arriver au même code, mais de vérifier que votre démarche TDD était bien respectée — les tests d'abord, toujours.
