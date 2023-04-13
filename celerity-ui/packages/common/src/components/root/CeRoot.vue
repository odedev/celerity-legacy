<template>
<div id="root" class="root">
  <slot></slot>
</div>
</template>
<style>
#root {
  width: 100%;
  height: 100%;
  position: relative;
  flex: 1 1 auto;
  display: flex;
  flex-direction: row;
  overflow: hidden;
}
</style>
