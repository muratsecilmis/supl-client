package com.google.location.lbs.asn1.supl2.lpp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1BitString;
import com.google.location.lbs.asn1.base.Asn1Null;
import com.google.location.lbs.asn1.base.Asn1Object;
import com.google.location.lbs.asn1.base.Asn1Sequence;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.location.lbs.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class WLAN_RequestLocationInformation_r13 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_WLAN_RequestLocationInformation_r13
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public WLAN_RequestLocationInformation_r13() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_WLAN_RequestLocationInformation_r13;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_WLAN_RequestLocationInformation_r13 != null) {
      return ImmutableList.of(TAG_WLAN_RequestLocationInformation_r13);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new WLAN_RequestLocationInformation_r13 from encoded stream.
   */
  public static WLAN_RequestLocationInformation_r13 fromPerUnaligned(byte[] encodedBytes) {
    WLAN_RequestLocationInformation_r13 result = new WLAN_RequestLocationInformation_r13();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new WLAN_RequestLocationInformation_r13 from encoded stream.
   */
  public static WLAN_RequestLocationInformation_r13 fromPerAligned(byte[] encodedBytes) {
    WLAN_RequestLocationInformation_r13 result = new WLAN_RequestLocationInformation_r13();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return true;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private WLAN_RequestLocationInformation_r13.requestedMeasurements_r13Type requestedMeasurements_r13_;
  public WLAN_RequestLocationInformation_r13.requestedMeasurements_r13Type getRequestedMeasurements_r13() {
    return requestedMeasurements_r13_;
  }
  /**
   * @throws ClassCastException if value is not a WLAN_RequestLocationInformation_r13.requestedMeasurements_r13Type
   */
  public void setRequestedMeasurements_r13(Asn1Object value) {
    this.requestedMeasurements_r13_ = (WLAN_RequestLocationInformation_r13.requestedMeasurements_r13Type) value;
  }
  public WLAN_RequestLocationInformation_r13.requestedMeasurements_r13Type setRequestedMeasurements_r13ToNewInstance() {
    requestedMeasurements_r13_ = new WLAN_RequestLocationInformation_r13.requestedMeasurements_r13Type();
    return requestedMeasurements_r13_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getRequestedMeasurements_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRequestedMeasurements_r13();
          }

          @Override public void setToNewInstance() {
            setRequestedMeasurements_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WLAN_RequestLocationInformation_r13.requestedMeasurements_r13Type.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "requestedMeasurements_r13 : "
                    + getRequestedMeasurements_r13().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
    }

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class requestedMeasurements_r13Type extends Asn1BitString {
  //

  // defined bit positions, if any
  public static final int rssi = 0;
  public static final int rtt = 1;
  

  // setters
  public final void set_rssi() {
    ensureValuePopulated();
    getValue().set(0);
  }
  public final void set_rtt() {
    ensureValuePopulated();
    getValue().set(1);
  }
  

  // clearers
  public final boolean get_rssi() {
    ensureValuePopulated();
    return getValue().get(0);
  }
  public final boolean get_rtt() {
    ensureValuePopulated();
    return getValue().get(1);
  }
  


  private static final Asn1Tag TAG_requestedMeasurements_r13Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public requestedMeasurements_r13Type() {
    super();
    setMinSize(1);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_requestedMeasurements_r13Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_requestedMeasurements_r13Type != null) {
      return ImmutableList.of(TAG_requestedMeasurements_r13Type);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new requestedMeasurements_r13Type from encoded stream.
   */
  public static requestedMeasurements_r13Type fromPerUnaligned(byte[] encodedBytes) {
    requestedMeasurements_r13Type result = new requestedMeasurements_r13Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new requestedMeasurements_r13Type from encoded stream.
   */
  public static requestedMeasurements_r13Type fromPerAligned(byte[] encodedBytes) {
    requestedMeasurements_r13Type result = new requestedMeasurements_r13Type();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    return "requestedMeasurements_r13Type = " + getValue() + ";\n";
  }
}

  

    

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    StringBuilder builder = new StringBuilder();
    builder.append("WLAN_RequestLocationInformation_r13 = {\n");
    final String internalIndent = indent + "  ";
    for (SequenceComponent component : getComponents()) {
      if (component.isExplicitlySet()) {
        builder.append(internalIndent)
            .append(component.toIndentedString(internalIndent));
      }
    }
    if (isExtensible()) {
      builder.append(internalIndent).append("...\n");
      for (SequenceComponent component : getExtensionComponents()) {
        if (component.isExplicitlySet()) {
          builder.append(internalIndent)
              .append(component.toIndentedString(internalIndent));
        }
      }
    }
    builder.append(indent).append("};\n");
    return builder.toString();
  }
}
