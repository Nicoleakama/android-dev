import java.time.LocalDate
import java.time.LocalTime

fun main(){
   clock()
}
 fun clock(){
     var date = LocalDate.now()
     var time = LocalTime .now()
     var day =date.dayOfWeek
     var month=date.month
     var year=date.year
     var leap=date.isLeapYear
     var days:Int=365
     println(time)
     println(day)
     println(month)
     print(year)
     print(leap)
     print(days)


 }