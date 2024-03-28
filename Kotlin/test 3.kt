
fun main(){
    val d = 14
    val e = 20

    var bad:  Int
    var max: Int

    if ( d>e ) {

        max = d

    }else{
        max = e
    }
    bad = max
            while (true){
                if (bad % d == 0 && bad % e ==0){
                    println("LCM OF $d AND $e is $bad")
                    break
                }
bad += max
            }            }



