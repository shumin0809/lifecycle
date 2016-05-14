# life cycle

This app demos the life cycle of activity, fragment and view.

## Activity
#### 1. launch new activity: 
	onCreate() -> onStart() -> onResume()
#### 2. destroy an activity:
	onPause() -> onStop() -> onDestroy()
#### 3. resume activity:
	onStart() -> onResume()
#### 4. pause activity:
	onPause() -> onStop()
#### 5. click back button (destroy)
	onPause() -> onStop() -> onDestroy()
#### 6. click home button (pause)
	onPause() -> onStop()
#### 7. click overview button (pause)
	onPause() -> onStop()
	
## Fragment
#### 1. same as activity

## Custom view
#### 1. create new view
	onFinishInflate() -> onAttachedToWindow()
#### 2. destroy a view
	onDetachedFromWindow()

