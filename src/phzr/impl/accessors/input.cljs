(ns phzr.impl.accessors.input)

(def input-constants
  {:max-pointers "MAX_POINTERS"
   :mouse-overrides-touch "MOUSE_OVERRIDES_TOUCH"
   :mouse-touch-combine "MOUSE_TOUCH_COMBINE"
   :touch-overrides-mouse "TOUCH_OVERRIDES_MOUSE"})

(def input-get-properties
  {:active-pointer "activePointer"
   :circle "circle"
   :double-tap-rate "doubleTapRate"
   :enabled "enabled"
   :game "game"
   :gamepad "gamepad"
   :hit-canvas "hitCanvas"
   :hit-context "hitContext"
   :hold-rate "holdRate"
   :interactive-items "interactiveItems"
   :just-pressed-rate "justPressedRate"
   :just-released-rate "justReleasedRate"
   :keyboard "keyboard"
   :max-pointers "maxPointers"
   :min-priority-id "minPriorityID"
   :mouse "mouse"
   :mouse-pointer "mousePointer"
   :mspointer "mspointer"
   :multi-input-override "multiInputOverride"
   :on-down "onDown"
   :on-hold "onHold"
   :on-tap "onTap"
   :on-up "onUp"
   :pointer-1 "pointer1"
   :pointer-10 "pointer10"
   :pointer-2 "pointer2"
   :pointer-3 "pointer3"
   :pointer-4 "pointer4"
   :pointer-5 "pointer5"
   :pointer-6 "pointer6"
   :pointer-7 "pointer7"
   :pointer-8 "pointer8"
   :pointer-9 "pointer9"
   :pointers "pointers"
   :poll-locked "pollLocked"
   :poll-rate "pollRate"
   :position "position"
   :record-limit "recordLimit"
   :record-pointer-history "recordPointerHistory"
   :record-rate "recordRate"
   :reset-locked "resetLocked"
   :scale "scale"
   :speed "speed"
   :tap-rate "tapRate"
   :total-active-pointers "totalActivePointers"
   :total-inactive-pointers "totalInactivePointers"
   :touch "touch"
   :world-x "worldX"
   :world-y "worldY"
   :x "x"
   :y "y"})

(def input-set-properties
  {:active-pointer "activePointer"
   :circle "circle"
   :double-tap-rate "doubleTapRate"
   :enabled "enabled"
   :game "game"
   :gamepad "gamepad"
   :hit-canvas "hitCanvas"
   :hit-context "hitContext"
   :hold-rate "holdRate"
   :interactive-items "interactiveItems"
   :just-pressed-rate "justPressedRate"
   :just-released-rate "justReleasedRate"
   :keyboard "keyboard"
   :max-pointers "maxPointers"
   :min-priority-id "minPriorityID"
   :mouse "mouse"
   :mouse-pointer "mousePointer"
   :mspointer "mspointer"
   :multi-input-override "multiInputOverride"
   :on-down "onDown"
   :on-hold "onHold"
   :on-tap "onTap"
   :on-up "onUp"
   :pointer-1 "pointer1"
   :pointer-10 "pointer10"
   :pointer-2 "pointer2"
   :pointer-3 "pointer3"
   :pointer-4 "pointer4"
   :pointer-5 "pointer5"
   :pointer-6 "pointer6"
   :pointer-7 "pointer7"
   :pointer-8 "pointer8"
   :pointer-9 "pointer9"
   :poll-rate "pollRate"
   :position "position"
   :record-limit "recordLimit"
   :record-pointer-history "recordPointerHistory"
   :record-rate "recordRate"
   :reset-locked "resetLocked"
   :scale "scale"
   :speed "speed"
   :tap-rate "tapRate"
   :touch "touch"
   :x "x"
   :y "y"})