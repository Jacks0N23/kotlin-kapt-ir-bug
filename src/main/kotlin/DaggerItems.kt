import dagger.Component
import dagger.Module
import dagger.Provides

@Component(modules = [SomeModule::class])
interface SomeComponent {

    fun someInterface(): SomeInterface
}

@Module
object SomeModule {

    @Provides
    fun provideSomeInterface(): SomeInterface {
        return object : SomeInterface {
            override suspend fun invoke(p1: List<String>, p2: Boolean): List<Int> {
                return listOf(1, 2, 3)
            }
        }
    }
}