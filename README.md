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
#### 1. create new fragment
	onAttach() -> onCreat() -> onCreateView() -> onViewCreated() -> 
	onActivityCreated() -> onViewStateRestored() -> onStart() -> onResume()
#### 2. delete a fragment
	onPause() -> onStop() -> onDestroyView() -> onDestroy() -> onDetach()
#### 3. Fragment's lifecycle is tied to its owning activity

## Custom view
#### 1. create new view
	onFinishInflate() -> onAttachedToWindow()
#### 2. destroy a view
	onDetachedFromWindow()

