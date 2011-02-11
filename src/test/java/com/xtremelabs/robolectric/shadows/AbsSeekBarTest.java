package com.xtremelabs.robolectric.shadows;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;

import android.app.Activity;
import android.content.Context;
import android.widget.AbsSeekBar;

import com.xtremelabs.robolectric.Robolectric;
import com.xtremelabs.robolectric.WithTestDefaultsRunner;

@RunWith(WithTestDefaultsRunner.class)
public class AbsSeekBarTest {
	
	@Test
	public void testInheritance() {
		TestAbsSeekBar seekBar = new TestAbsSeekBar(new Activity());
		ShadowAbsSeekBar shadow = Robolectric.shadowOf(seekBar);
		assertThat(shadow, instanceOf(ShadowProgressBar.class));
	}
	
	private static class TestAbsSeekBar extends AbsSeekBar {
		
		public TestAbsSeekBar(Context context) {
			super(context);
		}
	}
}
