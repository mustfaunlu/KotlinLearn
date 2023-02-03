package basics.variable_types

//Boolean typelar kotlinde sadece true ve false degerlerini alir.
val isStudent: Boolean = true
val isTeacher: Boolean = false

//Boolean degerlerde numberlar gibi nullable olursa boxed olur.
//Ve nullable bool degerler 3. bir secenek null alabilir bu yuzde null kontrolu yapmamiz gerekir.

//best practice olarak basina is kelimesi koyulur.

// &&, || , and, or, xor, !, not() gibi operatorler ile beraber kullanilabilir.

// if(isStudent || isTeacher){}  or operatorude kullanabiliriz infix fonksiyondur.

//eger bir if blogu icinde condition yerinde boolean kkullaniyorsak true ye esitlememize gerek yoktur
//if(isStudent) yeterlidir    // false icinde !isStudent yadaa isStudent.not() seklinde kullanabiliriz