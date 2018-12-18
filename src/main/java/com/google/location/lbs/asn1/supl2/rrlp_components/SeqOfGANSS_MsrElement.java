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
public  class SeqOfGANSS_MsrElement
    extends Asn1SequenceOf<GANSS_MsrElement> {
  //

  private static final Asn1Tag TAG_SeqOfGANSS_MsrElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SeqOfGANSS_MsrElement() {
    super();
    setMinSize(1);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SeqOfGANSS_MsrElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SeqOfGANSS_MsrElement != null) {
      return ImmutableList.of(TAG_SeqOfGANSS_MsrElement);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SeqOfGANSS_MsrElement from encoded stream.
   */
  public static SeqOfGANSS_MsrElement fromPerUnaligned(byte[] encodedBytes) {
    SeqOfGANSS_MsrElement result = new SeqOfGANSS_MsrElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SeqOfGANSS_MsrElement from encoded stream.
   */
  public static SeqOfGANSS_MsrElement fromPerAligned(byte[] encodedBytes) {
    SeqOfGANSS_MsrElement result = new SeqOfGANSS_MsrElement();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GANSS_MsrElement createAndAddValue() {
    GANSS_MsrElement value = new GANSS_MsrElement();
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
    builder.append("SeqOfGANSS_MsrElement = [\n");
    final String internalIndent = indent + "  ";
    for (GANSS_MsrElement value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
