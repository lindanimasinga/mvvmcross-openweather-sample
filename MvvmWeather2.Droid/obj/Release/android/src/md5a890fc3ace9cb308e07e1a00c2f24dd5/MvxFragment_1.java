package md5a890fc3ace9cb308e07e1a00c2f24dd5;


public abstract class MvxFragment_1
	extends mvvmcross.droid.support.v4.MvxFragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MvvmCross.Droid.Support.V4.MvxFragment`1, MvvmCross.Droid.Support.Fragment, Version=5.0.5.0, Culture=neutral, PublicKeyToken=null", MvxFragment_1.class, __md_methods);
	}


	public MvxFragment_1 () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MvxFragment_1.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V4.MvxFragment`1, MvvmCross.Droid.Support.Fragment, Version=5.0.5.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

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
