fun main() {
    val maVoiture = Voiture("Toyota", "Corolla", 2020)
    println("Avant modification: ${maVoiture.getMarque()} ${maVoiture.getModele()} ${maVoiture.getAnnee()}")

    maVoiture.setMarque("Honda")
    maVoiture.setModele("Civic")
    maVoiture.setAnnee(2021)

    println("Après modification: ${maVoiture.getMarque()} ${maVoiture.getModele()} ${maVoiture.getAnnee()}")

    val maVoiture2 = Voiture("Honda", "Civic", 2021)
    val maVoiture3 = Voiture("Ford", "Mustang", 1969)

    println("Ma 2ème voiture : ${maVoiture2.getMarque()} ${maVoiture2.getModele()} ${maVoiture2.getAnnee()}")
    println("Ma 3ème voiture : ${maVoiture3.getMarque()} ${maVoiture3.getModele()} ${maVoiture3.getAnnee()}")

    println("Nombre total de voitures : ${Voiture.nombreDeVoitures}")

}
