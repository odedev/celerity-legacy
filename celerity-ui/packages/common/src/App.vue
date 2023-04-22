<template>
<CeHeader>
  <CeLogo>
    LOGO
  </CeLogo>
  <CeCell style="width: 336px; width: 440px; background-color: #9E9E9E">
    Admin
  </CeCell>
</CeHeader>
<CeRoot>
  <CeMenu>
    Menu
  </CeMenu>
  <CeMain>
    <CeNav>
      CeNav

    </CeNav>
    <CePage>
      <CeView>
        <CeViewAside>
          CeViewAside
        </CeViewAside>
        <CeViewMain>
          <CeViewNav>
            CeViewNav
          </CeViewNav>
          <CeViewHead>
            <CeBox>
              <CeCell>
                <label>

                  标题名称是的</label>
                <input type="text">
              </CeCell>
              <CeCell>
                <label>标题名称是的</label>
                <input type="text">
              </CeCell>
            </CeBox>
            <CeBox>
              <button>列表</button><button>保存</button>
            </CeBox>
          </CeViewHead>
          <CeViewBody>
<!--            <CeTable></CeTable>-->
            <CeContent>
              <CeTable></CeTable>
            </CeContent>
            <CeContent>
              <CeTable></CeTable>
              <div style="display: flex;flex-direction: column;width: max-content;">
                <div style="display: flex;width: 100%;height: 36px; padding-bottom: 4px; justify-content: space-between;align-items: flex-end;">
                  <h3 class="title" style="padding-right: 48px;">标题</h3>
                  <div>
                    <button>列表</button><button>保存</button>
                  </div>
                </div>
                <table>
                  <colgroup>
                    <col style="max-width: 208px;">
                    <col style="width: 208px;background-color: red">

                  </colgroup>
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
                  <tr><td><input type="text"></td></tr>
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
              <CeCell>
                <label>标题名称是的</label>
                <input type="text">
              </CeCell>
              <CeCell>
                <label>标题名称是的</label>
                <input type="text">
              </CeCell>
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
                <div style="display: flex;width: 100%;height: 36px; padding-bottom: 4px; justify-content: space-between;align-items: flex-end;background-color: aliceblue;">
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
                    <tr><td><input type="text"></td></tr>
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
            <CeContent>
              <table>
                <thead>
                <tr>
                <th> Name </th>
                <th> Code </th>
                </tr>
                </thead>
                <tbody>
                <tr>
                  <td>dsd</td>
                  <td>dsd</td>

                </tr>
                <tr>
                  <td>dsd</td>
                  <td>dsd</td>
                </tr>
                </tbody>
                <tfoot>
                <tr>
                  <td>dsds</td>
                  <td>dsds</td>
                </tr>
                </tfoot>
              </table>

            </CeContent>
            </CeViewBody>
        </CeViewMain>
      </CeView>
    </CePage>
  </CeMain>
</CeRoot>
<CeFooter>CeFooter 主题 帮助 查找 提示 历史</CeFooter>
</template>
<script setup>
import {
  CeRoot, CeHeader, CeFooter, CeLogo, CeMenu, CeMain, CeNav, CeTab, CePage,
  CeView, CeViewAside, CeViewMain, CeViewNav,  CeViewHead, CeViewBody, CeContent, CeBox, CeCell,
  CeTable
} from './components/index.js'
</script>
<style>
    button {
      display: inline-block;
      height: 28px;
      padding: 0 12px;
      margin-left: 8px;
      font-size: inherit;
    }
    button:first-child {
      margin-left: 0;
    }

    form {

    }

    label {
      display: inline-block;
      width: 128px;
      max-width: 128px;
      height: 28px;
      line-height: 28px;
      height: 2em;
      line-height: 2em;
      padding: 0 8px;
      text-align: right;
    }
    input {
      display: inline-block;
      height: 28px;
      line-height: 28px;
      height: 2em;
      line-height: 2em;
      padding: 0 4px;
      font-size: inherit;
      width: 208px;
      /*width: 272px;*/
      max-width: 272px;
      max-width: 336px;

      border-radius: 2px;
      border: 1px solid #E0E0E0;
    }

    /*table, */
    tr, td {
      border: 1px solid #E0E0E0;
    }
    /*thead, tfoot {*/
    /*  background-color: #CFD8DC;*/
    /*}*/
    td {
      height: 30px;
      height: 32px;
      height: 40px;
      padding: 0 8px;
    }
    /*tbody tr:nth-child(even) {*/
    /*  background-color: #F8F8F8;*/
    /*}*/
    tbody tr:hover {
      background-color: #ECEFF1;
    }

    thead tr {
      height: 36px;
    }
    tfoot tr {
      height: 32px;
    }


    .title {
      font-size: 18px;
      line-height: 18px;
      font-weight: 500;
    }
</style>
