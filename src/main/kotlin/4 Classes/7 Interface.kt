package `4 Classes`

/**
 * Interfacelerin, Abstract classlardan en buyuk farki state tutamiyor oluslari.Yani icinde bir veri tanimlayip tutamiyoruz.
 * interface fonksiyonlari bir class icindeki hicbir yapiya ihtiyac duymazlar bir yerde tetiklenmeyi bekleyip baska bir yerde calismayi bekler.
 *
 * Interface icerisindeki initial degeri olmayan bir property(field) ya da body si olmayan bir fonksiyon
 * abstract olarak da tanimlanabilir.ama abstract tanimlama geregi yoktur.
 *
 * interfaceleri anlami geregi final yapamazsiniz. open yazilmasi da gereksizdir.(redundant)
 *
 * class lar inherit edilirken, interfaceler implement edilir. open koyma mantigi yoktur zaten amac implementtir.
 *
 * abstractlar; sozlesmeyken kesinlikle(override) sahip olmasi gerenkenleri soyler, default olarak yapilanlar
 * interfaceler; ise herhangi bir classin interface e sahip olmasi demek yeteneklerini artiryor demektir. harici beceri seti kazandirir
 *
 * Eger bir class a harici beceri seti kazandirmak isteniyorsa interface e yazmak gerekiyor.
 * abstract class a open function tanimlamak yerine interface ile yapilmalidir.
 * bu functionu interface verip class a implement edersin daha temiz kod yazmis olursun.
 *
 * open bir fonksyionu abstract icine yaziyorsak abstract icindeki bir bilgiye ihtiyac duyoyorsa tanimlariz. yani superi cagirarak is yapiyorsa tanimlanir.
 * fakat hicbirseye ihtiyac duymuyorsa abstract yerine interface tanimlamaliyiz.
 */

interface MyInterface {
    val prop: Int //abstract


    /*
    aslinda burada veri tutmuyoruz bu bir propertydir.
    property set get functionlari old icin interfacelerdede
    function tanimlandigi icin veri tutuyormusuz gibi oluyour.
     */
    val propertyWithImplementation: String
    get() = "Foo"



}