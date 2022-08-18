fun main() {
//     val camel = """Switching on the camera in the camel habitat...
// ___.-''''-.
///___  @    |
//',,,,.     |         _.'''''''._
//     '     |        /           \
//     |     \    _.-'             \
//     |      '.-'                  '-.
//     |                               ',
//     |                                '',
//      ',,-,                           ':;
//           ',,| ;,,                 ,' ;;
//              ! ; !'',,,',',,,,'!  ;   ;:
//             : ;  ! !       ! ! ;  ;   :;
//             ; ;   ! !      ! !  ; ;   ;,
//            ; ;    ! !     ! !   ; ;
//            ; ;    ! !    ! !     ; ;
//           ;,,      !,!   !,!     ;,;
//           /_I      L_I   L_I     /_I
//Look at that! Our little camel is sunbathing!"""
//
//     val lion = """Switching on the camera in the lion habitat...
//                                               ,w.
//                                             ,YWMMw  ,M  ,
//                        _.---.._   __..---._.'MMMMMw,wMWmW,
//                   _.-""        '''           YP"WMMMMMMMMMb,
//                .-' __.'                   .'     MMMMW^WMMMM;
//    _,        .'.-'"; `,       /`     .--""      :MMM[==MWMW^;
// ,mM^"     ,-'.'   /   ;      ;      /   ,       MMMMb_wMW"  @\
//,MM:.    .'.-'   .'     ;     `\    ;     `,     MMMMMMMW `"=./`-,
//WMMm__,-'.'     /      _.\      F'''-+,,   ;_,_.dMMMMMMMM[,_ / `=_}
//"^MP__.-'    ,-' _.--""   `-,   ;       \  ; ;MMMMMMMMMMW^``; __|
//           /   .'            ; ;         )  )`{  \ `"^W^`,   \  :
//          /  .'             /  (       .'  /     Ww._     `.  `"
//         /  Y,              `,  `-,=,_{   ;      MMMP`""-,  `-._.-,
//        (--, )                `,_ / `) \/"")      ^"      `-, -;"\:
//The lion is roaring!"""
//
//     val deer = """Switching on the camera in the deer habitat...
//   /|       |\
//`__\\       //__'
//   ||      ||
// \__`\     |'__/
//   `_\\   //_'
//   _.,:---;,._
//   \_:     :_/
//     |@. .@|
//     |     |
//     ,\.-./ \
//     ;;`-'   `---__________-----.-.
//     ;;;                         \_\
//     ';;;                         |
//      ;    |                      ;
//       \   \     \        |      /
//        \_, \    /        \     |\
//          |';|  |,,,,,,,,/ \    \ \_
//          |  |  |           \   /   |
//          \  \  |           |  / \  |
//           | || |           | |   | |
//           | || |           | |   | |
//           | || |           | |   | |
//           |_||_|           |_|   |_|
//          /_//_/           /_/   /_/
//Our 'Bambi' looks hungry. Let's go to feed it!"""
//
//     val goose = """Switching on the camera in the goose habitat...
//
//                                    _
//                                ,-"" "".
//                              ,'  ____  `.
//                            ,'  ,'    `.  `._
//   (`.         _..--.._   ,'  ,'        \    \
//  (`-.\    .-""        ""'   /          (  d _b
// (`._  `-"" ,._             (            `-(   \
// <_  `     (  <`<            \              `-._\
//  <`-       (__< <           :
//   (__        (_<_<          ;
//    `------------------------------------------
//The goose is staring intently at you... Maybe it's time to change the channel?"""
//
//     val bat = """Switching on the camera in the bat habitat...
//_________________               _________________
// ~-.              \  |\___/|  /              .-~
//     ~-.           \ / o o \ /           .-~
//        >           \\  W  //           <
//       /             /~---~\             \
//      /_            |       |            _\
//         ~-.        |       |        .-~
//            ;        \     /        i
//           /___      /\   /\      ___\
//                ~-. /  \_/  \ .-~
//                   V         V
//This bat looks like it's doing fine."""
//
//    val rabbit = """Switching on the camera in the rabbit habitat...
//         ,
//        /|      __
//       / |   ,-~ /
//      Y :|  //  /
//      | jj /( .^
//      >-"~"-v"
//     /       Y
//    jo  o    |
//   ( ~T~     j
//    >._-' _./
//   /   "~"  |
//  Y     _,  |
// /| ;-"~ _  l
/// l/ ,-"~    \
//\//\/      .- \
// Y        /    Y
// l       I     !
// ]\      _\    /"\
//(" ~----( ~   Y.  )
//It looks like we will soon have more rabbits!"""
//
//    val animals = arrayOf(camel, lion, deer, goose, bat, rabbit)
//
//    do{
//        print("Please enter the number of the habitat you would like to view: ")
//        val reader = readln()
//        if (reader == "exit" || reader.toInt() >= 6 ) {
//            println("See you later!")
//           return
//        }
//        val i = animals[reader.toInt()]
//        println(i)
//    } while (reader.toInt() in 0..5)
//
//
        val num = readln()
        println(num.last() - 1)
    



}

