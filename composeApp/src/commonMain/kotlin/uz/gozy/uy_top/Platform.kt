package uz.gozy.uy_top

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform