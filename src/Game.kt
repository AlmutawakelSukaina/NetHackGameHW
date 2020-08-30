fun main()
{
    var healthPoints=89;
    val playerName="Madrigal"
    if (healthPoints==100)
        println("Madrigal is excellent condition!")
    else if(healthPoints in 90..99)
        println("Madrigal has a few scratches !")
    else if(healthPoints in 75..89) {
        println("Madrigal has some minor wounds!")

    }
    else if(healthPoints in 15..75)
        println("Madrigal looks pretty hurt!")
    else if(healthPoints in 0..14)
        println("Madrigal is in awful condition!")

    var isBlessed =true;
    isBlessed=healthPoints>=75

    if(isBlessed)
        println("has some minor wounds but is healing quite quickly")

    else
        println("has some minor wounds ")


    println(playerName+" "+healthPoints)
}