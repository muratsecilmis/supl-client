package com.google.location.lbs.asn1.supl2.ulp_version_2_parameter_extensions;

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
public  class GANSSPositionMethods
    extends Asn1SequenceOf<GANSSPositionMethod> {
  //

  private static final Asn1Tag TAG_GANSSPositionMethods
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSPositionMethods() {
    super();
    setMinSize(1);
setMaxSize(16);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSPositionMethods;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSPositionMethods != null) {
      return ImmutableList.of(TAG_GANSSPositionMethods);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSPositionMethods from encoded stream.
   */
  public static GANSSPositionMethods fromPerUnaligned(byte[] encodedBytes) {
    GANSSPositionMethods result = new GANSSPositionMethods();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSPositionMethods from encoded stream.
   */
  public static GANSSPositionMethods fromPerAligned(byte[] encodedBytes) {
    GANSSPositionMethods result = new GANSSPositionMethods();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GANSSPositionMethod createAndAddValue() {
    GANSSPositionMethod value = new GANSSPositionMethod();
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
    builder.append("GANSSPositionMethods = [\n");
    final String internalIndent = indent + "  ";
    for (GANSSPositionMethod value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
