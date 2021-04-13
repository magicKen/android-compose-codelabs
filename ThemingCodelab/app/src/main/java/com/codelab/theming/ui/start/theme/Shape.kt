/*
 * 版权所有(C) 2021 zhanggenhua
 * 创建: zhanggenhua 2021-04-13
 */

package com.codelab.theming.ui.start.theme

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

/**
 * @author zhanggenhua
 * @date 2021-04-13
 */

val JetnewsShapes = Shapes(
  small = CutCornerShape(topStart = 8.dp),
  medium = CutCornerShape(topStart = 24.dp),
  large = RoundedCornerShape(8.dp)
)