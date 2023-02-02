package getting_started

/**
Derleme zamanı sabitleri(compile-time constants)
Read-only bir property'nin değeri compile time'da biliniyorsa, const modifier'ını kullanarak onu compile time constant
olarak işaretleyin. Böyle bir property'nin aşağıdaki gereksinimleri karşılaması gerekir:

1-Top-level bir property veya bir object declaration veya bir companion object'in bir member'ı olmalıdır.

2-String türünde veya primitif türde bir değerle init edilmelidir.

3-Custom getter olamaz

Derleyici, sabitin(constant'in) referansını gerçek değeriyle değiştirerek sabitin kullanımlarını inline hale getirecektir.
Ancak, field silinmeyecektir ve bu nedenle reflection kullanılarak etkileşime girilebilir.


* */


//Bu tür propertyler annotationlar ile de kullanılabilir:
const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"

@Deprecated(SUBSYSTEM_DEPRECATED) fun foo() {}