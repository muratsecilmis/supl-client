package com.google.location.lbs.asn1.supl2.lpp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1OctetString;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * 
 */
public  class EPDU_Body extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_EPDU_Body
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public EPDU_Body() {
    super();
    
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_EPDU_Body;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_EPDU_Body != null) {
      return ImmutableList.of(TAG_EPDU_Body);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new EPDU_Body from encoded stream.
   */
  public static EPDU_Body fromPerUnaligned(byte[] encodedBytes) {
    EPDU_Body result = new EPDU_Body();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new EPDU_Body from encoded stream.
   */
  public static EPDU_Body fromPerAligned(byte[] encodedBytes) {
    EPDU_Body result = new EPDU_Body();
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

  @Override protected String getTypeName() {
    return "EPDU_Body";
  }
}
