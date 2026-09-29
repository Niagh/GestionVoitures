class Voiture(private var marque: String, private var modele: String, private var annee: Int) {


    companion object {
        var nombreDeVoitures = 0
            private set
    }
    init {
        nombreDeVoitures++
    }

    fun getMarque() = marque
    fun setMarque(nouvelleMarque: String) { marque = nouvelleMarque }

    fun getModele() = modele
    fun setModele(nouveauModele: String) { modele = nouveauModele }

    fun getAnnee() = annee
    fun setAnnee(nouvelleAnnee: Int) { annee = nouvelleAnnee }
}