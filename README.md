Updating from `1.2.1` to `1.3.0-beta04-dev885` causes `LazyColumn` to break at runtime for js apps.
    
We get the following error in the browser console:

```
Uncaught TypeError: $itemProvider.Item$composable_79iv1w_k$ is not a function
    at eval (LazyLayoutItemContentFactory.kt?f18b:99:38)
    at ComposableLambdaImpl.invoke_6harzl_k$ (ComposableLambda.js.kt?a45e:107:22)
    at eval (androidx-foundation.js:15074:25)
    at CompositionLocalProvider$composable (CompositionLocal.kt?857d:228:5)
    at SaveableStateHolderImpl.SaveableStateProvider$composable_n5yi3h_k$ (SaveableStateHolder.kt?22c2:84:13)
    at LazySaveableStateHolder.SaveableStateProvider$composable_n5yi3h_k$ (LazySaveableStateHolder.kt?0304:84:39)
    at eval (LazyLayoutItemContentFactory.kt?f18b:98:41)
    at ComposableLambdaImpl.invoke_6harzl_k$ (ComposableLambda.js.kt?a45e:107:22)
    at eval (androidx-foundation.js:15053:25)
    at eval (Composables.kt?f577:490:509)
```

This is also present in the first 1.3.0 release `1.3.0-alpha01-dev849`.

Steps to reproduce:
- checkout project
- run `./gradlew jsBrowserRun`
- notice nothing is rendered
- open browser console to see stack trace
