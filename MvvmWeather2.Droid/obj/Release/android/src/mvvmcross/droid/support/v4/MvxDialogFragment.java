package mvvmcross.droid.support.v4;


public abstract class MvxDialogFragment
	extends md57c2e139b5a1039d73d00fa17de655952.MvxEventSourceDialogFragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDestroy:()V:GetOnDestroyHandler\n" +
			"n_onStart:()V:GetOnStartHandler\n" +
			"n_onResume:()V:GetOnResumeHandler\n" +
			"n_onPause:()V:GetOnPauseHandler\n" +
			"n_onStop:()V:GetOnStopHandler\n" +
			"";
		mono.android.Runtime.register ("MvvmCross.Droid.Support.V4.MvxDialogFragment, MvvmCross.Droid.Support.Fragment, Version=5.0.5.0, Culture=neutral, PublicKeyToken=null", MvxDialogFragment.class, __md_methods);
	}


	public MvxDialogFragment () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MvxDialogFragment.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V4.MvxDialogFragment, MvvmCross.Droid.Support.Fragment, Version=5.0.5.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onDestroy ()
	{
		n_onDestroy ();
	}

	private native void n_onDestroy ();


	public void onStart ()
	{
		n_onStart ();
	}

	private native void n_onStart ();


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();


	public void onPause ()
	{
		n_onPause ();
	}

	private native void n_onPause ();


	public void onStop ()
	{
		n_onStop ();
	}

	private native void n_onStop ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
