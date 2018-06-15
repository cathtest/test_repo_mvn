package com.test;

import com.rlenc.Encode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncodeTest {

    private String str;

    @Test

    public void encoding0() {
        Encode enc = new Encode();
        assertEquals( "w13i13s13", enc.encoding("wwwiiisss"));



    }

    @Test(expected=NumberFormatException.class)

    public void decodingException() throws NumberFormatException {
        Encode enc = new Encode();
        assertEquals( "wweeefffff", enc.decoding("w11211e11311f11511"));



    }

    @Test
    
    public void decoding() {

        Encode enc = new Encode();
        assertEquals("wwwiiisss", enc.decoding("3w3i3s"));

    }



}