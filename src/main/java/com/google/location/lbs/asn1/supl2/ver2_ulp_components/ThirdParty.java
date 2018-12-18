package com.google.location.lbs.asn1.supl2.ver2_ulp_components;

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
public  class ThirdParty
    extends Asn1SequenceOf<ThirdPartyID> {
  //

  private static final Asn1Tag TAG_ThirdParty
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ThirdParty() {
    super();
    setMinSize(1);
setMaxSize(64);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ThirdParty;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ThirdParty != null) {
      return ImmutableList.of(TAG_ThirdParty);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ThirdParty from encoded stream.
   */
  public static ThirdParty fromPerUnaligned(byte[] encodedBytes) {
    ThirdParty result = new ThirdParty();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ThirdParty from encoded stream.
   */
  public static ThirdParty fromPerAligned(byte[] encodedBytes) {
    ThirdParty result = new ThirdParty();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public ThirdPartyID createAndAddValue() {
    ThirdPartyID value = new ThirdPartyID();
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
    builder.append("ThirdParty = [\n");
    final String internalIndent = indent + "  ";
    for (ThirdPartyID value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
