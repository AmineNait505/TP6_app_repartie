package corbaConversion;

/**
* corbaConversion/IconversionRemoteHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Conversion.idl
* jeudi 23 novembre 2023 09 h 34 WAT
*/

public final class IconversionRemoteHolder implements org.omg.CORBA.portable.Streamable
{
  public corbaConversion.IconversionRemote value = null;

  public IconversionRemoteHolder ()
  {
  }

  public IconversionRemoteHolder (corbaConversion.IconversionRemote initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corbaConversion.IconversionRemoteHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corbaConversion.IconversionRemoteHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corbaConversion.IconversionRemoteHelper.type ();
  }

}