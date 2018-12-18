package com.google.location.lbs.asn1.supl2.rrlp_components;

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
public  class SeqOfGANSSTimeModel_R10_Ext
    extends Asn1SequenceOf<GANSSTimeModelElement_R10_Ext> {
  //

  private static final Asn1Tag TAG_SeqOfGANSSTimeModel_R10_Ext
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SeqOfGANSSTimeModel_R10_Ext() {
    super();
    setMinSize(1);
setMaxSize(7);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SeqOfGANSSTimeModel_R10_Ext;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SeqOfGANSSTimeModel_R10_Ext != null) {
      return ImmutableList.of(TAG_SeqOfGANSSTimeModel_R10_Ext);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SeqOfGANSSTimeModel_R10_Ext from encoded stream.
   */
  public static SeqOfGANSSTimeModel_R10_Ext fromPerUnaligned(byte[] encodedBytes) {
    SeqOfGANSSTimeModel_R10_Ext result = new SeqOfGANSSTimeModel_R10_Ext();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SeqOfGANSSTimeModel_R10_Ext from encoded stream.
   */
  public static SeqOfGANSSTimeModel_R10_Ext fromPerAligned(byte[] encodedBytes) {
    SeqOfGANSSTimeModel_R10_Ext result = new SeqOfGANSSTimeModel_R10_Ext();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GANSSTimeModelElement_R10_Ext createAndAddValue() {
    GANSSTimeModelElement_R10_Ext value = new GANSSTimeModelElement_R10_Ext();
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
    builder.append("SeqOfGANSSTimeModel_R10_Ext = [\n");
    final String internalIndent = indent + "  ";
    for (GANSSTimeModelElement_R10_Ext value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
