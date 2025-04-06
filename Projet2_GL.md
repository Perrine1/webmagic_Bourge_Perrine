# Projet GL - Partie 2  
**Nom :** Bourge Perrine

---

## Améliorations apportées :

---

### Ajout de documentation en anglais
Ajouter de la documentation améliore la clarté du code. Cela permet de comprendre rapidement le rôle d’une méthode sans devoir lire en détail toute son implémentation. Cela facilite également le travail collaboratif.

**Commits :**  
- [d0049a8](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/d0049a895348a4d2a7ca54fcc33d7917fb05efb9)  
- [777fd5b](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/777fd5b372a442a1cbcc91d0d3375d9f8e14b4b6)

---

### Simplification et décomposition d’une méthode
Des méthodes longues ont été décomposées en plusieurs plus petites. Cela permet une meilleure lisibilité, favorise la maintenance, et suit le principe de responsabilité unique (Single Responsibility Principle).

**Commits :**  
- [84c35ee](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/84c35eeceb746a7d4f01b610e48c4d0516a3c207)  
- [fe7f0af](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/fe7f0af6451df99c24e314d32343c554429175a5)

---

### Suppression et remplacement de code déprécié
Les méthodes obsolètes ont été remplacées par des alternatives plus récentes, ce qui permet d’assurer la compatibilité avec les nouvelles versions des bibliothèques utilisées.

**Commits :**  
- [69e036e](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/69e036e965c027e4226a1880215b910a2aa22d24)  
- [323c060](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/323c0602ea045c243fb4d21e345d17af5cb0f1dc)

---

### Suppression de "nombres magiques"
Les valeurs numériques utilisées directement dans le code ont été remplacées par des constantes nommées, déclarées en haut de classe. Cela améliore la compréhension et permet une modification centralisée.

**Commit :**  
- [68a770d](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/68a770d0e47b8cf664370de7805328b01bbaffbb)

---

### Suppression de code mort
Du code inutilisé a été supprimé, ce qui réduit l’encombrement et améliore la lisibilité générale du projet.

**Commit :**  
- [9842b0d](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/9842b0d082ea5e7b9692e1f07cd6256addc48e07)

---

### Réorganisation de l’ordre des attributs et des méthodes
Les variables et méthodes ont été réorganisées selon les conventions suivantes :
- Constantes `static final` en haut
- Attributs d’instance ensuite
- Méthodes par visibilité : `public`, puis `protected`, `private`

Cela permet une lecture plus cohérente et structurée des classes.

**Commits :**  
- [a8b529e](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/a8b529edffe30154d8c4bbc3596d8c0ef5dac44f)  
- [f943722](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/f94372294a4e8d162f71a999baddbf3505581201)

---

### Lancement d’une exception en cas de valeur non reconnue
Une méthode a été modifiée pour qu’elle lève explicitement une exception lorsqu’elle reçoit une valeur invalide ou inconnue. Cela permet d’éviter des comportements silencieux ou inattendus.

**Commit :**  
- [83536e2](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/83536e284f55c8d063e5c7ab367651d2a81e12f9)

---
### Ajout d'un try catch pour gérer les erreurs
Une méthode a été modifiée pour mieux gérer les exceptions. Cette méthode gérait les exceptions en retournant -1 ce qui pouvait poser problème, car l'erreur n'était pas clairement défini. L'utilisation d'un try catch permet de rendre cela plus clair et de simplifier la gestion des erreurs lorsque cette méthode est appelée.

**Commit :**
[83536e2](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/f7c3dc30e0f057da7902e3c9c1eda6f2c0ff15ee)

---

### Suppression de code commenté
Une méthode contenait du code commenté, ce code n'était donc pas utile et nuisait à la clareté.

**Commit :**
- [f2271c8](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/f2271c819a245a10fd50760f190709d06a8090b1)

---

### Modification du nom d'une classe
Le nom d'une classe a été mis à jour pour mieux correspondre à sa fonction. C'est une classe de test, il faut donc ajouter le terme 'test' dans le nom de cette classe pour en comprendre la fonction sans avoir à ouvrir la fichier.

**Commit :**
[6c63968](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/6c63968a4486aacc651d1e0fa9e8c3549f980305)


---

### Ajout d'un test
Suppression d'un `@ignore` qui empéché l'exécution d'un test sans raison apparente. Cela permet d'avoir une meilleure couverture de test.

**Commit :**
[9de3777](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/9de37779ca9244c168fdedc3cf939363838a8bbc)


---

## Tentatives d'améliorations non aboutis :

---

### Traduction des commentaires en chinois
Beaucoup de commentaires sont en chinois, ce qui rend une partie du projet peu clair pour des personnes ne parlant pas cette langue. Il serait donc pertinant d'uniformmiser les commentaires pour qu'ils soient tous propsé en anglais commme c'est déjà le cas pour le readme principale. Néanmoins, ne parlant pas cette langue, je ne peux pas effectuer cette modification.

---

### Décomposition d'une "God class"
J'ai essayé de décomposer la classe `Spider` qui est une God class mais je n'y suis pas parvenu, elle gère beaucoup trop de chose en même temps et il est très difficile de la décomposé à cause de toutes les imbrications. L'idée était de décomposer cette classe en 6 classes. La principale étant `Spider`, qui devait gérer la coordination entres les autres classes, une classe `RequestManager` pour la gestion des requêtes, `PipelineRequest` pour la gestion des pipelines, `DownloaderManager`, pour la gestion des téléchargements. `ThreadManager` pour gérer les threads et `SpiderListenerManager ` pour la gestion des évènements.

---

### Simplification d'un test
J'ai essayé de modifier la classe de test `XpathSelectorTest` afin de créer un fichier html et appeler ce fichier dans la variable correspondant afin de simplifier la gestion de cette classe mais je n'y suis pas parvenu. J'ai rencontrer des difficultées pour créer le fihcier html du fait de sa taille et du fait qu'il fallait en adapter le format pour qu'il soit valide.