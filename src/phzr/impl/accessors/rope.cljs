(ns phzr.impl.accessors.rope)

(def rope-get-properties
  {:alive "alive"
   :alpha "alpha"
   :angle "angle"
   :animations "animations"
   :auto-cull "autoCull"
   :blend-mode "blendMode"
   :body "body"
   :bottom "bottom"
   :cache-as-bitmap "cacheAsBitmap"
   :camera-offset "cameraOffset"
   :canvas-padding "canvasPadding"
   :check-world-bounds "checkWorldBounds"
   :children "children"
   :crop-rect "cropRect"
   :debug "debug"
   :delta-x "deltaX"
   :delta-y "deltaY"
   :delta-z "deltaZ"
   :destroy-phase "destroyPhase"
   :dirty "dirty"
   :events "events"
   :exists "exists"
   :filter-area "filterArea"
   :filters "filters"
   :fixed-to-camera "fixedToCamera"
   :frame "frame"
   :frame-name "frameName"
   :fresh "fresh"
   :game "game"
   :height "height"
   :hit-area "hitArea"
   :in-camera "inCamera"
   :in-world "inWorld"
   :input "input"
   :input-enabled "inputEnabled"
   :key "key"
   :left "left"
   :lifespan "lifespan"
   :mask "mask"
   :name "name"
   :offset-x "offsetX"
   :offset-y "offsetY"
   :out-of-bounds-kill "outOfBoundsKill"
   :parent "parent"
   :pending-destroy "pendingDestroy"
   :pivot "pivot"
   :position "position"
   :previous-position "previousPosition"
   :previous-rotation "previousRotation"
   :render-order-id "renderOrderID"
   :renderable "renderable"
   :right "right"
   :rotation "rotation"
   :scale "scale"
   :scale-max "scaleMax"
   :scale-min "scaleMin"
   :segments "segments"
   :smoothed "smoothed"
   :stage "stage"
   :texture "texture"
   :top "top"
   :transform-callback "transformCallback"
   :transform-callback-context "transformCallbackContext"
   :type "type"
   :update-animation "updateAnimation"
   :visible "visible"
   :width "width"
   :world "world"
   :world-alpha "worldAlpha"
   :world-position "worldPosition"
   :world-rotation "worldRotation"
   :world-scale "worldScale"
   :world-visible "worldVisible"
   :x "x"
   :y "y"
   :z "z"})

(def rope-set-properties
  {:alive "alive"
   :alpha "alpha"
   :angle "angle"
   :animations "animations"
   :auto-cull "autoCull"
   :blend-mode "blendMode"
   :body "body"
   :cache-as-bitmap "cacheAsBitmap"
   :camera-offset "cameraOffset"
   :canvas-padding "canvasPadding"
   :check-world-bounds "checkWorldBounds"
   :crop-rect "cropRect"
   :debug "debug"
   :dirty "dirty"
   :events "events"
   :exists "exists"
   :filter-area "filterArea"
   :filters "filters"
   :fixed-to-camera "fixedToCamera"
   :frame "frame"
   :frame-name "frameName"
   :game "game"
   :height "height"
   :hit-area "hitArea"
   :input "input"
   :input-enabled "inputEnabled"
   :key "key"
   :lifespan "lifespan"
   :mask "mask"
   :name "name"
   :out-of-bounds-kill "outOfBoundsKill"
   :pending-destroy "pendingDestroy"
   :pivot "pivot"
   :position "position"
   :renderable "renderable"
   :rotation "rotation"
   :scale "scale"
   :scale-max "scaleMax"
   :scale-min "scaleMin"
   :segments "segments"
   :smoothed "smoothed"
   :texture "texture"
   :transform-callback "transformCallback"
   :transform-callback-context "transformCallbackContext"
   :update-animation "updateAnimation"
   :visible "visible"
   :width "width"
   :world "world"
   :world-visible "worldVisible"
   :x "x"
   :y "y"
   :z "z"})