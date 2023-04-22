<template>
  <div class="box">
    <slot></slot>
  </div>
</template>
<script>

</script>
<style lang="scss">
.box {
  font-size: 14px;
  //width: max-content;
  //width: 100%;
  position: relative;
  display: flex;
  flex-direction: row;
  //flex-wrap: nowrap;
  justify-content: flex-start;
  align-items: flex-start;
}
</style>
