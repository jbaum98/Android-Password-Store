/*
 * Copyright © 2014-2019 The Android Password Store Authors. All Rights Reserved.
 * SPDX-License-Identifier: GPL-3.0-only
 */
package com.passwordstore.android.ui.activity

import android.os.Bundle
import android.view.ViewGroup
import com.passwordstore.android.databinding.ActivitySplashBinding
import com.passwordstore.android.ui.EdgeToEdge

class SplashActivity : BaseActivity() {
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        EdgeToEdge.setUpRoot(binding.root as ViewGroup)
        setContentView(binding.root)
    }
}