package systems.keyvalue.librarythree


class LibThree private constructor(private val name: String) {
    companion object {
        @Volatile
        private lateinit var instance: LibThree

        fun getInstance(name: String): LibThree {
            synchronized(this) {
                if (!::instance.isInitialized) {
                    instance = LibThree(name)
                }
                return instance
            }
        }
    }

    fun show() {
        println("This is Singleton $name class!")
    }
}