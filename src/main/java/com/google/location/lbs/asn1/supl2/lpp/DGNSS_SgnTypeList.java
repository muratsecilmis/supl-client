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
public  class DGNSS_SgnTypeList
    extends Asn1SequenceOf<DGNSS_SgnTypeElement> {
  //

  private static final Asn1Tag TAG_DGNSS_SgnTypeList
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public DGNSS_SgnTypeList() {
    super();
    setMinSize(1);
setMaxSize(3);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_DGNSS_SgnTypeList;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_DGNSS_SgnTypeList != null) {
      return ImmutableList.of(TAG_DGNSS_SgnTypeList);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new DGNSS_SgnTypeList from encoded stream.
   */
  public static DGNSS_SgnTypeList fromPerUnaligned(byte[] encodedBytes) {
    DGNSS_SgnTypeList result = new DGNSS_SgnTypeList();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new DGNSS_SgnTypeList from encoded stream.
   */
  public static DGNSS_SgnTypeList fromPerAligned(byte[] encodedBytes) {
    DGNSS_SgnTypeList result = new DGNSS_SgnTypeList();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public DGNSS_SgnTypeElement createAndAddValue() {
    DGNSS_SgnTypeElement value = new DGNSS_SgnTypeElement();
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
    builder.append("DGNSS_SgnTypeList = [\n");
    final String internalIndent = indent + "  ";
    for (DGNSS_SgnTypeElement value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
