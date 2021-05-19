object test {
  import java.text.SimpleDateFormat
  import java.util.Calendar

  import Personne._

  def construire(nom:String, prenom: String, nationalite: String, sal: Double, dateN: String):Personne={
    val format = new SimpleDateFormat("d-M-y")
    val dateNais = format.parse(dateN)
    val today = Calendar.getInstance()
    val year = today.getWeekYear
    today.setTime(dateNais)
    val year1 = today.getWeekYear
    val age = year - year1
    return Personne(Some(nom), prenom, age, nationalite , sal)
  }
  def maseqscala():Unit={
    val maseq1:Seq[String] = Seq("yasmine", "stephanie", "Jean", "Wilfried", "paterne", "Hugues", "Richy")
    val maseq2 = maseq1.map(prenom => prenom.length())
    val maseq3 = maseq1.filter(prenom => prenom.length()>5).foreach(i => print(i + "\t"))
    val monmap: Map[String, String] = Map(
      "cc" ->"Cocody",
      "An" -> "Angre"
    )
    println(monmap.toList)
  }
  def main(args: Array[String]): Unit = {
     val personne1 =    construire("yasmine", "koua", "Ivoir", 17.25, "25-05-1996")

      maseqscala()
  }
}
