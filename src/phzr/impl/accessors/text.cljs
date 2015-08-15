(ns phzr.impl.accessors.text)

(def text-get-properties
  {:y "y"
   :auto-round "autoRound"
   :exists "exists"
   :shadow-stroke "shadowStroke"
   :animations "animations"
   :font-style "fontStyle"
   :mask "mask"
   :render-order-id "renderOrderID"
   :in-world "inWorld"
   :text-bounds "textBounds"
   :children "children"
   :align "align"
   :check-world-bounds "checkWorldBounds"
   :shadow-color "shadowColor"
   :cache-as-bitmap "cacheAsBitmap"
   :stroke-colors "strokeColors"
   :stroke "stroke"
   :scale-max "scaleMax"
   :fixed-to-camera "fixedToCamera"
   :shadow-offset-y "shadowOffsetY"
   :rotation "rotation"
   :stage "stage"
   :frame "frame"
   :shadow-offset-x "shadowOffsetX"
   :shadow-blur "shadowBlur"
   :stroke-thickness "strokeThickness"
   :key "key"
   :css-font "cssFont"
   :parent "parent"
   :previous-rotation "previousRotation"
   :bottom "bottom"
   :transform-callback "transformCallback"
   :tabs "tabs"
   :world-visible "worldVisible"
   :font-size "fontSize"
   :word-wrap-width "wordWrapWidth"
   :delta-y "deltaY"
   :scale "scale"
   :camera-offset "cameraOffset"
   :game "game"
   :top "top"
   :font-variant "fontVariant"
   :font-weight "fontWeight"
   :filters "filters"
   :blend-mode "blendMode"
   :offset-y "offsetY"
   :name "name"
   :frame-name "frameName"
   :filter-area "filterArea"
   :events "events"
   :fill "fill"
   :alive "alive"
   :tinted-texture "tintedTexture"
   :renderable "renderable"
   :word-wrap "wordWrap"
   :width "width"
   :type "type"
   :colors "colors"
   :delta-x "deltaX"
   :previous-position "previousPosition"
   :debug "debug"
   :max-health "maxHealth"
   :angle "angle"
   :world-rotation "worldRotation"
   :canvas "canvas"
   :font "font"
   :resolution "resolution"
   :tint "tint"
   :physics-type "physicsType"
   :hit-area "hitArea"
   :transform-callback-context "transformCallbackContext"
   :world "world"
   :z "z"
   :auto-cull "autoCull"
   :input-enabled "inputEnabled"
   :line-spacing "lineSpacing"
   :damage "damage"
   :delta-z "deltaZ"
   :world-scale "worldScale"
   :world-position "worldPosition"
   :bounds-align-h "boundsAlignH"
   :in-camera "inCamera"
   :padding "padding"
   :pending-destroy "pendingDestroy"
   :world-alpha "worldAlpha"
   :offset-x "offsetX"
   :alpha "alpha"
   :context "context"
   :right "right"
   :health "health"
   :out-of-bounds-kill "outOfBoundsKill"
   :position "position"
   :heal "heal"
   :pivot "pivot"
   :x "x"
   :lifespan "lifespan"
   :smoothed "smoothed"
   :anchor "anchor"
   :input "input"
   :destroy-phase "destroyPhase"
   :visible "visible"
   :body "body"
   :scale-min "scaleMin"
   :texture "texture"
   :shader "shader"
   :crop-rect "cropRect"
   :fresh "fresh"
   :height "height"
   :bounds-align-v "boundsAlignV"
   :left "left"
   :text "text"
   :shadow-fill "shadowFill"})

(def text-set-properties
  {:y "y"
   :auto-round "autoRound"
   :exists "exists"
   :shadow-stroke "shadowStroke"
   :animations "animations"
   :font-style "fontStyle"
   :mask "mask"
   :align "align"
   :check-world-bounds "checkWorldBounds"
   :shadow-color "shadowColor"
   :cache-as-bitmap "cacheAsBitmap"
   :stroke-colors "strokeColors"
   :stroke "stroke"
   :scale-max "scaleMax"
   :fixed-to-camera "fixedToCamera"
   :shadow-offset-y "shadowOffsetY"
   :rotation "rotation"
   :frame "frame"
   :shadow-offset-x "shadowOffsetX"
   :shadow-blur "shadowBlur"
   :stroke-thickness "strokeThickness"
   :key "key"
   :css-font "cssFont"
   :transform-callback "transformCallback"
   :tabs "tabs"
   :world-visible "worldVisible"
   :font-size "fontSize"
   :word-wrap-width "wordWrapWidth"
   :scale "scale"
   :camera-offset "cameraOffset"
   :game "game"
   :font-variant "fontVariant"
   :font-weight "fontWeight"
   :filters "filters"
   :blend-mode "blendMode"
   :name "name"
   :frame-name "frameName"
   :filter-area "filterArea"
   :events "events"
   :fill "fill"
   :alive "alive"
   :tinted-texture "tintedTexture"
   :renderable "renderable"
   :word-wrap "wordWrap"
   :width "width"
   :type "type"
   :colors "colors"
   :debug "debug"
   :max-health "maxHealth"
   :angle "angle"
   :canvas "canvas"
   :font "font"
   :resolution "resolution"
   :tint "tint"
   :hit-area "hitArea"
   :transform-callback-context "transformCallbackContext"
   :world "world"
   :z "z"
   :auto-cull "autoCull"
   :input-enabled "inputEnabled"
   :line-spacing "lineSpacing"
   :damage "damage"
   :bounds-align-h "boundsAlignH"
   :padding "padding"
   :pending-destroy "pendingDestroy"
   :alpha "alpha"
   :context "context"
   :health "health"
   :out-of-bounds-kill "outOfBoundsKill"
   :position "position"
   :heal "heal"
   :pivot "pivot"
   :x "x"
   :lifespan "lifespan"
   :smoothed "smoothed"
   :anchor "anchor"
   :input "input"
   :visible "visible"
   :body "body"
   :scale-min "scaleMin"
   :texture "texture"
   :shader "shader"
   :crop-rect "cropRect"
   :height "height"
   :bounds-align-v "boundsAlignV"
   :text "text"
   :shadow-fill "shadowFill"})