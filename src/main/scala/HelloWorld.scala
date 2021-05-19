object HelloWorld {

  import java.text.SimpleDateFormat
  import java.util.Calendar



  def calculSomme(a: Int, b: Int): Int = {
    val resultat = a+b
    val res2 = resultat*15
    return res2
  }
  def macollectionscala():Unit={
    val maliste = List("jvc", "jjj","ecole","pays")

    val maliste2: List[String] = List("Julien", "jvc")
    val maliste3: List[Int] = List(1,7,5,8,9)
    maliste.foreach(l => println(l.toUpperCase()))
    val maliste4 = maliste2.map(l => println(l.toUpperCase()))
  }

  def main(args: Array[String]): Unit = {
    val text : String = "Hello world"
    println(text)
    println("ceci est mon premier code scala")

    val Yasmine = Personne(Some("Kouadio"),"Stephanie",24,"Cote d'Ivoire", 20.790)
    val Stephanie =  Personne(None, "Yasmine", 24, "Ivoirienne", 30.777)
    var age_personne = Stephanie.age
    val nom_pers = Yasmine.nom
    println(nom_pers)
    println("l'age est de: "+age_personne)
    println("14 sommé à 15 = "+ calculSomme(14,15))

    println(Yasmine.age)
    macollectionscala()

  }
}


