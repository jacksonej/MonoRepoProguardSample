package systems.keyvalue.librarytwo


class LibTwo private constructor(private val name: String) {
    companion object {
        @Volatile
        private lateinit var instance: LibTwo

        fun getInstance(name: String): LibTwo {
            synchronized(this) {
                if (!::instance.isInitialized) {
                    instance = LibTwo(name)
                }
                return instance
            }
        }
    }

    fun show() {
        println("This is Singleton $name class!")
    }
}