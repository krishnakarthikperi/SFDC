import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@polymer/paper-input/paper-input.js';
import '@polymer/paper-button/paper-button.js';
import '@polymer/polymer/lib/elements/dom-repeat.js';

/**
 * `lab1problem1-element`
 * 
 *
 * @customElement
 * @polymer
 * @demo demo/index.html
 */
class Lab1problem1Element extends PolymerElement {
  static get template() {
    return html`
      <style>
        :host {
          display: block;
        }
      </style>

      <p>Angular 2 Operation</p>
      <dom-repeat items={{tasks}} as="task">
        <template>
          <paper-input always-float-label label={{task.field}} value={{task.fieldValue.value}}></paper-input>
        </template>
      </dom-repeat>
      <paper-button raised on-click="onSubmit">Add Employee</paper-button>
      <br> 
      <p>[[tasks.0.fieldValue.value]] [[tasks.1.fieldValue.value]] [[tasks.2.fieldValue.value]] [[tasks.3.fieldValue.value]]</p>
      `;
  }
  static get properties() {
    return {
      tasks:{
        type:Array,
        value:()=>[
          {
            field:"ID",
            fieldValue:{
              type:Number,
              value:null
            }
          },
          {
            field:"Name",
            fieldValue:{
              type:String,
              value:null
            }
          },
          {
            field:"Salary",
            fieldValue:{
              type:Number,
              value:null
            }
          },
          {
            field:"Department",
            fieldValue:{
              type:String,
            }
          },
        ]
      }
    };
  }
  onSubmit(){
   alert(this.tasks[0].fieldValue.value+" "+this.tasks[1].fieldValue.value+" "+this.tasks[2].fieldValue.value+" "+this.tasks[3].fieldValue.value);
  }
}

window.customElements.define('lab1problem1-element', Lab1problem1Element);
