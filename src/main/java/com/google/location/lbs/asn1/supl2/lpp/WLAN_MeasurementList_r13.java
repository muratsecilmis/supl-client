package com.google.location.lbs.asn1.supl2.lpp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Null;
import com.google.location.lbs.asn1.base.Asn1SequenceOf;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * 
 */
public  class WLAN_MeasurementList_r13
    extends Asn1SequenceOf<WLAN_MeasurementElement_r13> {
  //

  private static final Asn1Tag TAG_WLAN_MeasurementList_r13
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public WLAN_MeasurementList_r13() {
    super();
    setMinSize(1);
setMaxSize(maxWLANAPSize_r13.VALUE.intValue());

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_WLAN_MeasurementList_r13;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_WLAN_MeasurementList_r13 != null) {
      return ImmutableList.of(TAG_WLAN_MeasurementList_r13);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new WLAN_MeasurementList_r13 from encoded stream.
   */
  public static WLAN_MeasurementList_r13 fromPerUnaligned(byte[] encodedBytes) {
    WLAN_MeasurementList_r13 result = new WLAN_MeasurementList_r13();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new WLAN_MeasurementList_r13 from encoded stream.
   */
  public static WLAN_MeasurementList_r13 fromPerAligned(byte[] encodedBytes) {
    WLAN_MeasurementList_r13 result = new WLAN_MeasurementList_r13();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public WLAN_MeasurementElement_r13 createAndAddValue() {
    WLAN_MeasurementElement_r13 value = new WLAN_MeasurementElement_r13();
    add(value);
    return value;
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
    builder.append("WLAN_MeasurementList_r13 = [\n");
    final String internalIndent = indent + "  ";
    for (WLAN_MeasurementElement_r13 value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
