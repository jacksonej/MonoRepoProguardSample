package systems.keyvalue.libraryone


class LibOne private constructor(private val name: String) {
    companion object {
        @Volatile
        private lateinit var instance: LibOne

        fun getInstance(name: String): LibOne {
            synchronized(this) {
                if (!::instance.isInitialized) {
                    instance = LibOne(name)
                }
                return instance
            }
        }
    }

    fun show() {
        println("This is Singleton $name class!")
    }
}