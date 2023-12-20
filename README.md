# Pattern State 
## Catégorie :
          • Comportement
##Objectif du pattern
          • Changer le comportement d'un objet selon son état interne.
##Résultat :
          • Le Design Pattern permet d'isoler les algorithmes propres à chaque état 
          d'un objet.


![image](https://github.com/2002marie03/StatePattern/assets/95045123/9bf145e2-5ea7-4765-8edb-e3874934c97d)

# Gestion des États d'un Avion

Ce projet met en œuvre le pattern State pour modéliser les différents états d'un avion, notamment "Dans le garage", "Sur la piste", et "En l'air". Les transitions entre ces états sont gérées par des méthodes spécifiques.

## Fonctionnalités

- **Garage**: Lorsque l'avion est dans le garage, la méthode `sortirDuGarage` le fait passer à l'état "Sur la piste".
- **Piste**: Lorsque l'avion est sur la piste, la méthode `entrerAuGarage` le fait passer à l'état "Dans le garage". La méthode `décoller` permet de passer à l'état "En l'air".
- **En l'air**: Lorsque l'avion est en l'air, la méthode `atterrir` le fait passer à l'état "Sur la piste".

**Remarque**: Les autres combinaisons d'états et de méthodes génèrent des erreurs, par exemple, tenter de décoller lorsque l'avion est dans le garage.

## Exécution

![image](https://github.com/2002marie03/StatePattern/assets/95045123/51e22eb1-d906-494a-9d2a-9bce06296a54)

