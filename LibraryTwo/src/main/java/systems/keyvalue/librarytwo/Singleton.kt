package systems.keyvalue.librarytwo

class Singleton private constructor(private val name: String) {
    companion object {
        @Volatile
        private lateinit var instance: Singleton

        fun getInstance(name: String): Singleton {
            synchronized(this) {
                if (!::instance.isInitialized) {
                    instance = Singleton(name)
                }
                return instance
            }
        }
    }

    fun show() {
        println("This is Singleton $name class!")
    }
}