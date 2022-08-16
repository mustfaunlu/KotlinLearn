package `4 Classes`

/**
 * Nested ya da local typealias Kullanimi desteklemiyor
 *
 * typeAlias lar arka planda yeni bir class olusturmazlar. Sadece etikeleme yaparlar.
 */

typealias AccountReferenceVM = ProjectContractChargingPeriodProjectAccountRefrenceVM
//herhangi bir function yada class icinde yapmak yerine globalde tanimlamak gerekir.

fun main() {
    val projectContractChargingPeriodProjectAccountRefrenceVM = ProjectContractChargingPeriodProjectAccountRefrenceVM()
    //yukardaki sekilde yazmak yerine asagidaki gibi maple typealias aslinda etiket gibidir.
    val accountRefrenceVM = AccountReferenceVM()

}
class ProjectContractChargingPeriodProjectAccountRefrenceVM {}