import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@polymer/paper-button/paper-button.js'
/**
 * `my-article`
 * 
 *
 * @customElement
 * @polymer
 * @demo demo/index.html
 */
class MyArticle extends PolymerElement {
  static get template() {
    return html`
      <style>
        :host {
          display: block;
        }
        .article{
          display:block;
          width:25%;
          background-color:#fff;
          color:#ff3f3;
          box-shadow:0 4px 8px 0 #888888;
          text-align:center;
          padding:1%;
          margin:1%;
        }
      </style>
      <div class="article">
        <h2>Hello Polymer [[name]]!</h2>
        <h2>age = [[age]]</h2>
        <paper-button>[[btn]]</paper-button>
      </div>
    `;
  }
  static get properties() {
    return {
      name:{
        type:String,
        value:'world' 
      },
      age:{
        type:Number,
        value:0
      },
      btn:{
        type:String,
        value:'More'
      }
    };
  }
}

window.customElements.define('my-article', MyArticle);
