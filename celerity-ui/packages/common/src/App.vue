<template>
<CeHeader>
  <CeLogo>
    LOGO
  </CeLogo>
</CeHeader>
<CeRoot>
  <CeMenu>
    Menu
  </CeMenu>
  <CeMain>
    <CeNav>
      CeNav
    </CeNav>
    <CeView>
      <CePage>
        <CePageAside>
          CePageAside
        </CePageAside>
        <CePageMain>
          <CePageNav>
            CePageNav
          </CePageNav>
          <CePageHead>
            <button>列表</button><button>保存</button>
          </CePageHead>
          <CePageBody>
            <CeContent>
              CeApp
              CeLogo
              CeContent
              CeView
              CePage
              CePageNav
              CePageMain
              CePageHead
              CePageBody
              CePageFoot
            </CeContent>
            <CeContent>
              <i style="width: 24px;height: 24px;">
                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512">
                <!--! Font Awesome Pro 6.4.0 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2023 Fonticons, Inc. -->
                <path d="M342.6 150.6c12.5-12.5 12.5-32.8 0-45.3s-32.8-12.5-45.3 0L192 210.7 86.6 105.4c-12.5-12.5-32.8-12.5-45.3 0s-12.5 32.8 0 45.3L146.7 256 41.4 361.4c-12.5 12.5-12.5 32.8 0 45.3s32.8 12.5 45.3 0L192 301.3 297.4 406.6c12.5 12.5 32.8 12.5 45.3 0s12.5-32.8 0-45.3L237.3 256 342.6 150.6z"/>
              </svg>
              </i>
            </CeContent>
            <CeContent>
              <div style="display: flex;flex-direction: column;width: max-content;border: 1px solid #f5f5f5;">
                <div style="display: flex;width: 100%;height: 36px; padding-bottom: 8px; justify-content: space-between;align-items: flex-end;background-color: aliceblue;">
                  <h3 class="title" style="padding-right: 48px;">标题</h3>
                  <div>
                    <button>列表</button><button>保存</button>
                  </div>
                </div>
                <table>
                  <thead>
                    <tr>
                      <td>name</td>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>1212</td>
                    </tr>
                  </tbody>
                  <tfoot>
                    <tr><td>1212</td></tr>
                  </tfoot>
                </table>
                <div style="display: flex;width: 100%;height: 32px;justify-content: space-between;align-items: center; background-color: aliceblue;">
                  <div>过滤</div>
                  <div>
                    page
                  </div>
                </div>
              </div>

            </CeContent>
            </CePageBody>
        </CePageMain>
      </CePage>
    </CeView>
  </CeMain>
</CeRoot>
</template>
<script setup>
import {CeRoot, CeHeader, CeLogo, CeMenu, CeMain, CeNav, CeTab, CeView, CePage, CePageAside,CePageMain, CePageNav,  CePageHead, CePageBody, CeContent} from './components/index.js'
</script>
<style scoped>
    button {
      display: inline-block;
      height: 28px;
      padding: 0 12px;
      margin-left: 8px;
    }
    button:first-child {
      margin-left: 0;
    }

    .title {
      font-size: 18px;
      line-height: 18px;
      font-weight: 500;
    }
</style>
