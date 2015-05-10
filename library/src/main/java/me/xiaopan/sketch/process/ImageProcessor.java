/*
 * Copyright (C) 2013 Peng fei Pan <sky@xiaopan.me>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.xiaopan.sketch.process;

import android.graphics.Bitmap;

import me.xiaopan.sketch.Resize;

/**
 * 图片处理器，你可以是实现此接口，将你的图片处理成你想要的效果
 */
public interface ImageProcessor {
	/**
	 * 处理
	 * @param bitmap 要被处理的图片
	 * @param resize 新的尺寸
	 * @return 新的图片
	 */
	Bitmap process(Bitmap bitmap, Resize resize);

    /**
     * 获取标识符用于生成缓存ID
     * @return 标识符
     */
    String getIdentifier();

    /**
     * 追加标识符
     * @param builder
     */
    void appendIdentifier(StringBuilder builder);
}