The app has an activity MainActivity which has a TextView and a ComposeView.
On pressing enter in text view, the app crashes with an exception as:

FATAL EXCEPTION: main
Process: com.example.myapp, PID: 1023
java.lang.IllegalStateException: focus search returned a view that wasn't able to take focus!
at android.widget.TextView.onEditorAction(TextView.java:8361)
at com.android.internal.inputmethod.EditableInputConnection.performEditorAction(EditableInputConnection.java:177)
at android.view.inputmethod.InputConnectionWrapper.performEditorAction(InputConnectionWrapper.java:253)
at android.view.inputmethod.RemoteInputConnectionImpl.lambda$performEditorAction$21(RemoteInputConnectionImpl.java:729)
at android.view.inputmethod.RemoteInputConnectionImpl.$r8$lambda$ut6QNr7zBb4-Qo_Um9CAU01VYcQ(Unknown Source:0)
at android.view.inputmethod.RemoteInputConnectionImpl$$ExternalSyntheticLambda16.run(Unknown Source:6)
at android.os.Handler.handleCallback(Handler.java:958)
at android.os.Handler.dispatchMessage(Handler.java:99)
at android.os.Looper.loopOnce(Looper.java:230)
at android.os.Looper.loop(Looper.java:319)
at android.app.ActivityThread.main(ActivityThread.java:8934)
at java.lang.reflect.Method.invoke(Native Method)
at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:588)
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1103)

We have also observed that if we make the next compose view as focusable explicilty, the issue is resolved.
